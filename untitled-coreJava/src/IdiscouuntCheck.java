public class IdiscouuntCheck {

    public Boolean doCheckDiscountObject(){
        Student stu = new Student();
        if (stu instanceof IdiscountMrker){
            return true;
        }

        return false;
    }

    public Boolean doCheckDiscountObject2(){
        TwoSumSolution two = new TwoSumSolution();
        if (two instanceof IdiscountMrker){
            return true;
        }

        return false;
    }
}
