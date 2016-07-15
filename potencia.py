var1 = raw_input("ingresa una letra:  ")
var2 = raw_input("ingrsa la potencia que sea menor o igual a 3:  ")
var2 = int(var2)
var3 = var2/2

if var2 > 4:
	print "el numero ingresado e mayor a 3"
else:
	for x in xrange(0,var2):
		print var1