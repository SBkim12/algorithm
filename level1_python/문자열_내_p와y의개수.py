def solution(s):
    answer = True

    p = 0
    y = 0
    for i in s:
        if(i == "p" or i == "P"):
            p += 1
        elif(i == "Y" or i == "y"):
            y += 1

    if(p != y):
        return False

    return True


# test
print(solution("ppYyY"))
