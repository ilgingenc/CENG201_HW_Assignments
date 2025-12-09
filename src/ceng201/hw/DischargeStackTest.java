package ceng201.hw;

public class DischargeStackTest {
    public static void main(String[] args) {
        DischargeStack stacks = new DischargeStack();

        DischargeRecord r1 = new DischargeRecord(1, System.currentTimeMillis());
        DischargeRecord r2 = new DischargeRecord(2, System.currentTimeMillis());
        DischargeRecord r3 = new DischargeRecord(3, System.currentTimeMillis());
        DischargeRecord r4 = new DischargeRecord(4, System.currentTimeMillis());
        DischargeRecord r5 = new DischargeRecord(5, System.currentTimeMillis());

        stacks.push(r1);
        stacks.push(r2);
        stacks.push(r3);
        stacks.push(r4);
        stacks.push(r5);

        stacks.pop();
        stacks.pop();

        stacks.printStack();

    }
}
