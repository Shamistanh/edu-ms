package sdp.edums.app.service;

import org.springframework.stereotype.Service;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.model.Lecture;
import sdp.edums.app.repository.AssignmentRepository;
import sdp.edums.app.repository.LectureRepository;

import java.util.List;
import java.util.UUID;

@Service
public class LectureService {

    private final LectureRepository lectureRepository;

    public LectureService(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }


    public List<Lecture> fetchAllLectures(String courseId){
        return lectureRepository.findAllByCourseId(courseId);
    }

    public int createLecture(Lecture lecture) {
        if (lecture.getCourseId() == null){
            return 0;
        }else {
            try {
                lecture.setId(UUID.randomUUID().toString());
                lectureRepository.save(lecture);
                return 1;
            }catch (Exception ex){
                return 0;
            }
        }
    }
}
