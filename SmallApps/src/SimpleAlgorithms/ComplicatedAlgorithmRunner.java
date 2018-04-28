package SimpleAlgorithms;

class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm {

    protected void firstMethodToExecute() {
        System.out.println("This is first method to execute");
    }

    protected void secondMethodToExecute() {
        System.out.println("This is second method to execute");
    }

    @Override
    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }
    public void runOld() {
        super.run();
    }

}