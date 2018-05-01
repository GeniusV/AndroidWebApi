
import random

collage_template = "INSERT INTO collage VALUES ({}, '{}');\n"
course_template = "INSERT INTO course VALUE ({}, '{}', {});\n"
major_template = "INSERT INTO major VALUES ({}, '{}', {});\n"
claxx_template = "INSERT INTO claxx VALUES ({}, '{}', {});\n"
student_template = "INSERT INTO student VALUES ({}, '{}', {});\n"

n = 3



with open("test.sql", 'w', encoding = 'utf-8') as f:
    f.write("USE android_api;\n")
    f.write("DELETE FROM claxx;\n")
    f.write("DELETE FROM collage;\n")
    f.write("DELETE FROM course;\n")
    f.write("DELETE FROM major;\n")
    f.write("DELETE FROM score;\n")
    f.write("DELETE FROM student;\n")
    f.write("DELETE FROM term;\n")

    for i in range(n):
        f.write("INSERT INTO term VALUES ({}, '{}');\n".format(i + 1, "term" + str(i + 1)))

    for i in range(n):
        collage_id = 10+ i
        f.write(collage_template.format(collage_id, "collage" + str(i+1)))
        for major in range(n):
            major_id = collage_id * n + major
            f.write(course_template.format(major_id, "collage" + str(i + 1) + "course" + str(major + 1), collage_id))
            f.write(major_template.format(major_id, "collage" + str(i + 1) + "major" + str(major + 1), collage_id))
            for claxx in range(n):
                claxx_id = major_id * n + claxx
                f.write(claxx_template.format(claxx_id, "collage" + str(i + 1) + "major" + str(major + 1) + "claxx" + str(claxx+1), major_id))
                for student in range(n):
                    student_id = claxx_id*n + student
                    f.write(student_template.format(student_id, "collage" + str(i + 1) + "major" + str(major + 1) + "claxx" + str(claxx+1) + "stu" + str(student + 1), claxx_id))
                    for term in range(n):
                        middle_id = student_id* n + term
                        for score in range (n):
                            f.write("INSERT INTO score VALUE ({}, {}, {}, {}, {});\n".format(middle_id*n + score, random.randint(0, 100), major_id, student_id, score + 1))


