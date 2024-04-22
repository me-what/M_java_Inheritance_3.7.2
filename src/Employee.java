class Employee extends Person{
    String company;

    public Employee(String name, String company) {
        super(name);
        this.company=company;
    }
    @Override
    public void display(){
        // System.out.printf("Name: %s \n", getName());
        super.display();
        System.out.printf("Works in %s \n", company);
    }
}