import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(101, "Ngabo Sam", "Saving", "400000","0.3"));
        accList.add(new Account(102, "Cyusa David", "Checking", "130000","0.4"));
        accList.add(new Account(103, "Nkaka Herve", "Credit", "220000","0.1"));
        accList.add(new Account(104, "Kanyana Alice", "Debit", "450000","0.2"));
        accList.add(new Account(105, "Mugisha Henry", "Saving", "230000","0.7"));
        accList.add(new Account(106, "Keza Lucy", "Checking", "300000","0.6"));
        accList.add(new Account(107, "Ishimwe Landry", "Credit", "200000","0.1"));
        accList.add(new Account(108, "Kundwa Benitha", "Debit", "250000","1"));
        accList.add(new Account(109, "Izabayo Becky", "Saving", "400000","0.2"));
        accList.add(new Account(200, "Nsenga Phoibe", "Debit", "215000","0.5"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}