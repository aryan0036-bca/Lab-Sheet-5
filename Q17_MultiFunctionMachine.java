interface Printer { void print(); }
interface Scanner { void scan(); }
class MultiFunctionMachine implements Printer, Scanner {
    private String machineName; private int machineId;
    public void setMachineName(String name) { machineName = name; }
    public String getMachineName() { return machineName; }
    public void setMachineId(int id) { machineId = id; }
    public int getMachineId() { return machineId; }
    public void print() { System.out.println("Printing document..."); }
    public void scan() { System.out.println("Scanning document..."); }
}
class Q17_MultiFunctionMachine {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.setMachineName("OfficePro"); m.setMachineId(501);
        System.out.println("Machine: " + m.getMachineName()); System.out.println("ID: " + m.getMachineId());
        m.print(); m.scan();
    }
}
