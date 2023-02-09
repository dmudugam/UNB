import os,glob

strings_plus = []
for p in glob.glob("*.py"):
    size=os.stat(p).st_size
    strings_plus.append(p + "\t" + str(size))

strings_format = ["{0}\t{1}".format(file, os.stat(file).st_size) for file in glob.glob("*.py")]
