const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question("Enter student name: ", function(name) {

  readline.question("Enter number of registered units: ", function(units) {

    units = parseInt(units);

    if (units > 7) {
      console.log("Overload - Approval Required");
    } else {
      console.log("Registration Accepted");
    }

    console.log("\n--- Registration Summary ---");
    console.log("Student:", name);
    console.log("Units:", units);

    readline.close();
  });

});