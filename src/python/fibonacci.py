def fibonacci(inp) :

    answer = ""
    number1 = 0
    number2 = 1
    switchLoop = True

    for loop in range(inp+1, range >  0, -1):

        if switchLoop :
            answer += str(number1) + " "
            number1 += number2
            switchLoop = False

        elif not switchLoop :
            answer += str(number2) + " "
            number2 += number1
            switchLoop = True
    
    return answer.strip()