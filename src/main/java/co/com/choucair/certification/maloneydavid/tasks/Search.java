package co.com.choucair.certification.maloneydavid.tasks;

import co.com.choucair.certification.maloneydavid.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    public Search(String srtCourse) {
        this.srtCourse = srtCourse;
    }

    private String srtCourse;

    public static Search the(String srtCourse) {
        return Tasks.instrumented(Search.class, srtCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(srtCourse).into(SearchCoursePage.INPUT_SEARCH),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.INPUT_SELECT),
                Click.on(SearchCoursePage.INPUT_COURSE)
        );

    }
}
