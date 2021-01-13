print("Welcome to FizzBuzz Program in Python")
start = int(input("Please Enter Starting Number: "))
end = int(input("Please Enter Ending Number: "))
for number in range(start, end):
    if number % 3 == 0 and number % 5 == 0:
        print("FizzBuzz")
    elif number % 3 == 0:
        print("Fizz")
    elif number % 5 == 0:
        print("Buzz")
    else:
        print(number)
