public class StudentServiceImpl implements StudentService {

@Override
public StudentEntity postdata(StudentEntity stu){
return repo.save(stu);

@Override
public List<StudentEntity> getdata(){
return repo. findAll();

@Override
public StudentEntity updatedata(int id, StudentEntity std){
if(repo.existsById(id)){
std.setId(id);
return repo.save(std);

}
return null;

@Override
public SpringApplication delData(int id){
    repo deleteBy Id(id);
}