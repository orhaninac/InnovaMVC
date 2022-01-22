package patika.tutorials;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Log4j2
@Builder
public class Log4J2Tutorials {

    private String name;
    private String surname;
    private String number;

    public Log4J2Tutorials() {
        this.name="Oran";
        this.surname="Inac";
        this.number="12345";
    }

    public static void main(String[] args) {

        Log4J2Tutorials tutorials=new Log4J2Tutorials();
        System.out.println(tutorials);

        if(tutorials.getName().equals("Orhan")){
            log.info("Adınız Orhan");
        }
        else{
            log.error("Adınız Orhan değil");
        }
    }

}
