package lk.zerocode.lcprojectapi.service.impl;

import lk.zerocode.lcprojectapi.controller.request.StudentRegisterRequest;
import lk.zerocode.lcprojectapi.controller.response.StudentRegisterResponse;
import lk.zerocode.lcprojectapi.model.ClassFee;
import lk.zerocode.lcprojectapi.model.Guardian;
import lk.zerocode.lcprojectapi.model.MonthlyFee;
import lk.zerocode.lcprojectapi.model.Student;
import lk.zerocode.lcprojectapi.repository.ClassFeeRepository;
import lk.zerocode.lcprojectapi.repository.GuardianRepository;
import lk.zerocode.lcprojectapi.repository.MonthlyFeeRepository;
import lk.zerocode.lcprojectapi.repository.StudentRepository;
import lk.zerocode.lcprojectapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private GuardianRepository guardianRepository;
    private ClassFeeRepository classFeeRepository;
    private MonthlyFeeRepository monthlyFeeRepository;

    @Override
    public StudentRegisterResponse registerStudent( StudentRegisterRequest studentRequest) {

        Guardian guardian = new Guardian();

        guardian.setName(studentRequest.getGuardianName());
        guardian.setEmail(studentRequest.getGuardianEmail());
        guardian.setContactNumber(studentRequest.getContactNumber());
        guardian.setAddress(studentRequest.getAddress());
        guardian.setChildrenCount(studentRequest.getChildrenCount());

        guardian = guardianRepository.save(guardian);

        List<Student> studentList = studentRequest.getStudentList();

        for (Student students : studentList){

            Optional<ClassFee> classFeeOptional = classFeeRepository.findByClassType(students.getClassType());

            if (classFeeOptional.isPresent()){

                ClassFee classFee = classFeeOptional.get();

            }

            students.setGuardian(guardian);
        }

        studentRepository.saveAll(studentList);

        return StudentRegisterResponse.builder()
                .id(guardian.getId())
                .guardianName(guardian.getName())
                .guardianEmail(guardian.getEmail())
                .contactNumber(guardian.getContactNumber())
                .studentList(studentList)
                .build();
    }
}
