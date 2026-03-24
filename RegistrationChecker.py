name = input("Enter student name: ")
units = int(input("Enter number of registered units: "))

if units > 7:
    print("Overload - Approval Required")
else:
    print("Registration Accepted")

print("\n--- Registration Summary ---")
print("Student:", name)
print("Units:", units)