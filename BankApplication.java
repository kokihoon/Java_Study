import java.util.Scanner;

public class BankApplication {
    private static Accout[] accoutArray = new Accout[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                createAccout();
            } else if(selectNo == 2) {
                accoutList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if( selectNo == 5) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }

    private static void createAccout() {
        String ano;
        String name;
        int balance;
        System.out.println("-------------");
        System.out.println("계좌생성");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("계좌주: ");
        name = scanner.next();
        System.out.print("초기입금액: ");
        balance = scanner.nextInt();
        for(int i = 0; i < 100; i++) {
            if(accoutArray[i] == null) {
                accoutArray[i] = new Accout(ano, name, balance);
                break;
            }
        }
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private  static void accoutList() {
        for(int i =0; i < 100; i++) {
            if(accoutArray[i] != null)
                System.out.println(accoutArray[i].getAno()+"    " + accoutArray[i].getOwner() +"    "+ accoutArray[i].getBalance());
        }
    }

    private static void deposit() {
        String ano;
        int balance;
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("예금액: ");
        balance = scanner.nextInt();

        Accout findAno = findAccount(ano);
        balance += findAno.getBalance();
        findAno.setBalance(balance);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        String ano;
        int balance;
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("출금액: ");
        balance = scanner.nextInt();
        Accout findAno = findAccount(ano);
        balance = findAno.getBalance() - balance;
        if(balance < 0) {
            System.out.println("돈이 부족합니다.");
        }
        else {
            findAno.setBalance(balance);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    private static Accout findAccount(String ano) {
        for(int i =0; i < 100; i++) {
            if(accoutArray[i].getAno().equals(ano)){
                return accoutArray[i];
            }
        }
        return null;
    }
}
