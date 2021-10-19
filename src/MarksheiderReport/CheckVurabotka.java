package MarksheiderReport;

public class CheckVurabotka {

    public String hostName;
    String login;
    String password;

    public AnswerCheckVurabotka checkCityRegister() {
        System.out.println("checkVurabotka is running: " + hostName + ", " + login + ", " + password);
        AnswerCheckVurabotka ans = new AnswerCheckVurabotka();
        ans.success = true;
        return ans;
    }
}
