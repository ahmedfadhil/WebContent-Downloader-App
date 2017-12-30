import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Source from: https://food.ndtv.com/recipes/by-cuisine
        String webContent = "<a itemprop=\"url\" href=\" https://food.ndtv.com/recipes/cuban-recipes\" title=\"CUBAN\"><img itemprop=\"image\" content=\"https://food.ndtv.com/static/web/images/recipes/cuba.jpg\" onerror=\"this.src='https://food.ndtv.com/static/web/images/food-default-205x205.png'\" class=\"lazy\" data-original=\"https://food.ndtv.com/static/web/images/recipes/cuba.jpg\" src=\"https://food.ndtv.com/static/web/images/recipes/cuba.jpg\" alt=\"Cuban Recipes\" title=\"Cuban Recipes\" align=\"middle\" border=\"0\" width=\"205\" height=\"205\" style=\"display: block;\"><div class=\"desc\"><table class=\"main_images_c_bg\"><tbody><tr><td><div class=\"block\"><h2 itemprop=\"name\" class=\"recipe-image-header\">CUBAN</h2></div></td></tr></tbody></table></div></a>";
        Pattern p = Pattern.compile("href=\"(.*?)\"");
        Matcher m = p.matcher(webContent);
        while (m.find()) {
            System.out.println(m.group(1));
        }



        p = Pattern.compile("content=\"(.*?)\"");
        m = p.matcher(webContent);
        while (m.find()) {
            System.out.println(m.group(1));
        }


        p = Pattern.compile("alt=\"(.*?)\"");
        m = p.matcher(webContent);
        while (m.find()) {
            System.out.println(m.group(1));
        }


    }
}

