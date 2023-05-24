package  ma.zsmart.engflexy.ws.dto;

import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizClassRoomDto  extends AuditBaseDto {


    private ClassRoomDto classRoom ;
    private QuizDto quiz ;



    public QuizClassRoomDto(){
        super();
    }




    public ClassRoomDto getClassRoom(){
        return this.classRoom;
    }

    public void setClassRoom(ClassRoomDto classRoom){
        this.classRoom = classRoom;
    }
    public QuizDto getQuiz(){
        return this.quiz;
    }

    public void setQuiz(QuizDto quiz){
        this.quiz = quiz;
    }




}
