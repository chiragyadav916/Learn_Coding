//interface variable
interface Video155 {
    int amt = 10; //public+ static+ final

    void purchase(); //public+ abstract
}

class seller implements Video155 {
    @Override
    public void purchase() {
        System.out.println("Client needs " + amt + " rupees");
    }

    public static void main(String[] args) {
        Video155 r = new seller();
        r.purchase();
        System.out.println(Video155.amt);//static variable
    }
}
