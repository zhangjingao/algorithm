package 随笔.面试.面经.人人0618;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 */
public class Test1 {

    public static void main(String[] args) {
        String stuListString = "[{\"id\":\"1\",\"name\":\"张三\"},{\"id\":\"2\",\"name\":\"李四\"},{\"id\":\"3\",\"name\":\"王五\"},{\"id\":\"4\",\"name\":\"李雷\"}]";
        String scoreListString = "[{\"stuId\":\"1\", \"subjectId\":\"1\", \"subjectName\":\"英语\", \"score\":\"90\"},{\"stuId\":\"1\", \"subjectId\":\"2\", \"subjectName\":\"数学\", \"score\":\"80\"},{\"stuId\":\"1\", \"subjectId\":\"3\", \"subjectName\":\"语文\", \"score\":\"70\"},{\"stuId\":\"2\", \"subjectId\":\"1\", \"subjectName\":\"英语\", \"score\":\"85\"},{\"stuId\":\"2\", \"subjectId\":\"2\", \"subjectName\":\"数学\", \"score\":\"75\"},{\"stuId\":\"2\", \"subjectId\":\"3\", \"subjectName\":\"语文\", \"score\":\"90\"},{\"stuId\":\"3\", \"subjectId\":\"3\", \"subjectName\":\"语文\", \"score\":\"60\"}]";

        //学生记录集合
        JSONArray stuJsonArray = JSONArray.parseArray(stuListString);
        List<Student> studentList = new ArrayList<>(stuJsonArray.size());
        for (Object o: stuJsonArray) {
            JSONObject studentJson = JSONObject.parseObject(o.toString());
            Student student = new Student(Integer.parseInt(studentJson.get("id").toString()), studentJson.get("name").toString());
            studentList.add(student);
        }

        //分数记录集合
        JSONArray scoJsonArray = JSONArray.parseArray(scoreListString);
        List<Score> scoreList = new ArrayList<>(scoJsonArray.size());
        for (Object o: scoJsonArray) {
            JSONObject scoreJson = JSONObject.parseObject(o.toString());
            Score score = new Score(Integer.parseInt(scoreJson.get("stuId").toString()),
                    Integer.parseInt(scoreJson.get("subjectId").toString()),
                    scoreJson.get("subjectName").toString(), Double.parseDouble(scoreJson.get("score").toString()));
            scoreList.add(score);
        }

        studentList.forEach(student->{
            int stuId = student.getStu_id();
            String stuName = student.getStu_name();
            double totalScore = 0;
            System.out.println("学生 "+stuName+" 对应的每个科目及成绩分别为：");
            for (Score score : scoreList){
                if (score.getStu_id() == stuId) {
                    System.out.println(score.getSubject_name()+" "+score.getScore());
                    totalScore += score.getScore();
                }
            }
            System.out.println("总分为："+totalScore);
        });


    }

}

class Student {

    private int stu_id;
    private String stu_name;

    public Student() {}

    public Student(int stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                '}';
    }
}
class Score {

    private int stu_id;
    private int subject_id;
    private String subject_name;
    private double score;

    public Score() {}

    public Score(int stu_id, int subject_id, String subject_name, double score) {
        this.stu_id = stu_id;
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.score = score;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "stu_id=" + stu_id +
                ", subject_id=" + subject_id +
                ", subject_name='" + subject_name + '\'' +
                ", score=" + score +
                '}';
    }
}
