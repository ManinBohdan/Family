public class Main {
    public static void main(String[] args) {
        var Viktoriia = new Man ("Viktoriia", 27);
        var Maxim = new Man ("Maxim", 33);
        var Bohdan = new Man (Viktoriia, Maxim, "Bohdan");
        System.out.println("Info about children: ");
        System.out.println("----------------------------------------------");
        System.out.println("Children name is - " + Bohdan.Name);
        System.out.println("His mother name is - " + Bohdan.Mother.Name);
        System.out.println("His father name is - " + Bohdan.Father.Name);
        System.out.println("----------------------------------------------");
        System.out.println("Info about Mother: ");
        System.out.println("----------------------------------------------");
        System.out.println("Mother name is: " + Viktoriia.Name);
        System.out.println("Her children is: " + Viktoriia.Children.Name);
        System.out.println("----------------------------------------------");
        System.out.println("Info about Father: ");
        System.out.println("----------------------------------------------");
        System.out.println("Father name is: " + Maxim.Name);
        System.out.println("His children is: " + Maxim.Children.Name);


        System.out.println(Viktoriia.Children.improvedBirthday());
        System.out.println(Viktoriia.improvedBirthday());
        System.out.println(Maxim.improvedBirthday());


        Bohdan.setAge(17);
        System.out.println(Bohdan.Age);
        System.out.println(Bohdan.Mother.Age);
        System.out.println(Bohdan.Father.Age);



    }
}
