public class Main {
    public static void main(String[] args) {
        Company company = Company.getInstance();

        company.displayInfo();

        company.setCompanyName("EIU - Dai hoc Quoc te Mien dong");
        company.setAddress("3M38+6F3, Nam Kỳ Khởi Nghĩa, Định Hoà, Thủ Dầu Một, Bình Dương");
        company.setPhoneNumber("0274 2220 341");

        company.displayInfo();
    }
}