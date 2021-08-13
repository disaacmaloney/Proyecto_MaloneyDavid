package co.com.choucair.certification.maloneydavid.questions;

import co.com.choucair.certification.maloneydavid.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    public String srtQuestion;

    public Answer(String question) {
        this.srtQuestion = question;
    }

    public static Answer toThe(String srtQuestion){
        return new Answer(srtQuestion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCurso = Text.of(SearchCoursePage.INPUT_SELECT).viewedBy(actor).asString();
        if(srtQuestion.equals(nameCurso)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
