public class Main {
    public static void main(String[] args) throws Exception {
        LoanUI loanUI = new LoanUI();
        // Burada parametre tipi aslında BaseLoanManager, dolayısıyla Polymorphism yapılmakta.
        loanUI.calculateLoan(new TeacherLoanManager());
        loanUI.calculateLoan(new AgriculturalLoanManager());
        loanUI.calculateLoan(new MilitaryLoanManager());
    }
}
