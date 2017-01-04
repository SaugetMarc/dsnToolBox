fichier = open("rubriques.txt",'r')

lines = fichier.readlines()

pack = "package fr.sauget.dsn.dsntoolbox.model.Rubriques;"


for l in lines:
    nomFich = l.split("\t")[0]+".java"
    progs = l.split("\t")[1] 
    

    nF = open(nomFich, "a")

    nF.write(pack + progs)
    nF.close()
    print (nomFich +" .... " + progs)

fichier.close()