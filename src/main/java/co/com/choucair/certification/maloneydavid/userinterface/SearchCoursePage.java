package co.com.choucair.certification.maloneydavid.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select the university Choucair").located(By.xpath("//img[@alt='Cursos y Certificaciones']"));
    public static final Target INPUT_SEARCH = Target.the("select the university Choucair").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("select the university Choucair").located(By.xpath("//button[@type='submit']"));
    public static final Target INPUT_COURSE = Target.the("select the university Choucair").located(By.linkText("Foundation Express"));
    public static final Target INPUT_SELECT = Target.the("select the university Choucair").located(By.xpath("(//a[contains(text(),'Foundation Express')])[2]"));

}
