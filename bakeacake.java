class bakeacake{
    private String flavour;
    private String filling;
    private String topping;
    bakeacake(){
        System.out.println("Welcome to the Cake Shoppe! Build your cake!");
    }
        public String base(String flavour){
        this.flavour = flavour;
        return this.flavour;
    }

    public String filling(String fillingtype){
        this.filling = fillingtype;
        return this.filling;
    }

    public String topping(String toppingkind){
        this.topping = toppingkind;
        return this.topping;
    }

    public String cake(){
        return this.flavour +" "+ this.filling +" "+ this.topping;
    }
    public static void main(String[] args) {
        bakeacake birthday = new bakeacake();
        birthday.base("strawberry");
        birthday.filling("chocolate");
        birthday.topping("rainbow sprinkles");
        System.out.println(birthday.cake());
    }
}