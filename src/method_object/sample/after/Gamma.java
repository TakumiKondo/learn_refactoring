package method_object.sample.after;

//STEP1: Create new class
public class Gamma {

    // STEP2: Define fields(Source Class, args, local variables)
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    // STEP3: Define constructor(Source Class, args)
    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg){
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    // STEP4: Copy the method(gamma) of source class
    int compute() {
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;

        // STEP7: Replace with method
        importantThing();
//        if ((yearToDate - importantValue1) > 100) {
//            importantValue2 -= 20;
//        }

        importantValue3 = importantValue2 * 7;

        return importantValue3 - 2 * importantValue1;
    }

    // STEP5: See Account Class

    // STEP6: Extract method
    void importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
    }

}
