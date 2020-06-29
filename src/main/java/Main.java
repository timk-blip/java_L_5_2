public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

<<<<<<< HEAD
        long res = service.calculate(amount, registered);
        System.out.println(res);
=======
        service.calculate(amount, registered);
>>>>>>> 11c81cbb13dc3c11432c8b1694ea157766b82543

    }
}

