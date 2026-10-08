/// შექმენი კლასი Person, რომელსაც ექნება შემდეგი ცვლადები:
/// age, name, lastname, gender,  სადაც gender არის (male ან female)
/// ეს ცვლადები პარამეტრებად უნდა მიიღოს კლასმა კონსტრუქტორით. ერთი პარამეტრის გადაწოდებით კონსტრუქტორი უკვე გამოყენებული გვაქვს
/// რამდენიმეს პარამეტრის გადაცემაც იგივენაირად ხდება, თუ რაღაც AI გამოიყენე
///
/// კლასს უნდა  ქონდეს შემდეგი ფუნქციები:
/// fullName (ეს ფუნქცია უნდა აბრუნდებეს string-ს) name + lastname უნდა დააბრუნოს
/// bithDate (ეს ფუნქცია არ აბრუნებს არაფერს უნდა დაპრინტოს დაბადების წელი ასაკიდან გამომდინარე)
/// contrGender (ეს ფუნქცია უნდა პრინტავდეს საწინააღმდეგო სქესს, მაგრამ არა იქიდან გამომდინარე რომ შენ იცი კაცია თუ ქალი)

/// Main.java-ში შექმენი ამ კლასის 2 სხვადასხვა ობიექტი, ერთი ქალი რომ იყოდ და ერთი კაცი.
/// Main.java- ში დაპრინტე ამ ორი სხვადასხვა ობიექტის fullName-ები დაახლოებით ასეთი ფორმატით -- "ლუკა კილასონია -> ანა ჟიჟილაშვილი"
/// Main.java -ში დაპრინტე ასეთი რამე "ჯამური ასაკი = "ამ ტექსტის ადგილას უნდა იყოს ასაკების ჯამი""
/// Main.java -ში დაპრინტე ორივეს კონტრ გენდერი

public class Person {
    int age;
    String name;
    String lastname;
    String gender;

    public Person(int age, String name, String lastname, String gender) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String fullName(){
        return name + lastname;
    }
    public void birthDate() {
        int birthyear = 2026 - age;
        System.out.println(birthyear);
    }
    public void contrGender() {
        if (gender == "male") {
            System.out.println("female");
        }
        else {
            System.out.println(("male"));
        }

    }
}

