public class Man implements BirthdayDay, SetAge {
    public String Name;
    public Man Mother;
    public Man Father;
    public Man Children;
    public Integer Age;

    public Man(String Name, Integer Age){
        this.Name = Name;
        this.Age = Age;
}
    public Man(Man Mother, Man Father, String Name) {
        this.Mother = Mother;
        this.Father = Father;
        this.Name = Name;
        this.Age = 0;
        Mother.Children = this;
        Father.Children = this;
    }

    @Override
    public String birthday() {
        this.Age++;
        return "Yahoooooo! Congratulations! Today is your birthday! Your age become " + this.Age;
    }

    @Override
    public String improvedBirthday() {
    if (this.Age <= 22) {
        return before22();
    }
    else if (this.Age > 22 && this.Age < 40) {
        return after22();
    }
    else if (this.Age >= 40 && this.Age < 60) {
        return after40();
    }
    else if (this.Age >= 60) {
        return after60();
    }
    return "You might not be born)";
    }

    @Override
    public String before22() {
        this.Age++;
        return "Yahoooooo! Congratulations! Today is your birthday! Your age become " + this.Age;
    }

    @Override
    public String after22() {
        this.Age++;
        return " Our congratulations! You become a little bit older but also more clever. Your age now is: " + this.Age;
    }

    @Override
    public String after40() {
        this.Age++;
        return "Yeh, man, we know that there is a sad day for you, but you become older. But there is plus in fact you can show your beer belly not being shy. Your age now is:  " + this.Age;
    }

    @Override
    public String after60() {
        this.Age++;
        return "We want to greet you with your birthday, of course, if you remember your age))). But you have to pay attention to fact you should take a first trolley and ride to the product market." +
                "You should ask what for, it's easy, JUST FOR FUN! Your age now is: " + this.Age;
    }

    @Override
    public void setAge(Integer age) {
        Integer temp = this.Age;
        this.Age = age;
        if (this.Children != null) this.Children.Age += age - temp;
        this.Mother.Age += age - temp;
        this.Father.Age += age - temp;
    }
}
