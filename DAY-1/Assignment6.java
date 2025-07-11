public class Assignment6 {
    public static void main(String[] args) {
    System.out.println("Main started");
    firstStep();
    System.out.println("Main ended");
}
public static void firstStep(){ 
    System.out.println("First Step started");
    secondStep();
    System.out.println("First Step ended");
}
public static void secondStep(){
    System.out.println("Second Step started");
    System.out.println("Second Step ended");

}
        
}
    



// Question:
// Write a Java program with three methods:
// - main()
// - firstStep()
// - secondStep()

// From main(), call firstStep(), and inside that call secondStep().
// Print messages at start and end of each method.
// Use breakpoints in VS Code to observe the call stack step-by-step.
// Output Format:
// Main started
// First Step started
// Second Step started
// Second Step ended
// First Step ended
// Main ended
