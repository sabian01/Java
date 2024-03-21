class Main {

    public static void main(String[] args) {
        Facebook fb = new Facebook();
        Instagram intsa = new Instagram();
        SnapChat  snap = new SnapChat();
        fb.login();
        fb.logout();

        intsa.login();
        intsa.logout();

        snap.login();
        snap.logout();
    }

}

