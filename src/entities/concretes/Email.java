package entities.concretes;
import java.util.regex.Pattern;

public class Email {

    String email;

    //bahadirakin.com sitesinden buldum alttaki methodu ancak kullanımını entegre edemedim daha

        private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

        public static boolean isEmailValid(String emailInput) {
            Pattern pattern = Pattern.compile(EMAIL_PATTERN,
                    Pattern.CASE_INSENSITIVE);
            return pattern.matcher(emailInput).find();
        }


    public Email(String email) {
        if (isEmailValid(this.email)){
            this.email = email;
        }else {
            System.out.println("Email hatalı girildi");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(this.email)){
            this.email = email;
        }else {
            System.out.println("Email hatalı girildi");
        }
    }
}

