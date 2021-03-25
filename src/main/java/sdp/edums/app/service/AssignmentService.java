package sdp.edums.app.service;

import org.springframework.stereotype.Service;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.repository.AssignmentRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }


    public List<Assignment> fetchAllAssignments(String courseId){
        return assignmentRepository.findAllByCourseId(courseId);
    }

    public List<Assignment> fetchAllAssignments(){
        return assignmentRepository.findAll();
    }

    public int createAssignment(Assignment assignment) {
        if (assignment.getCourseId() == null){
            return 0;
        }else {
            try {
                assignment.setId(UUID.randomUUID().toString());
                assignmentRepository.save(assignment);
                return 1;
            }catch (Exception ex){
                return 0;
            }
        }
    }
}
