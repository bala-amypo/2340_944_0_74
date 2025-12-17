import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}