<h1 style="color:red">Compte Rendu Tp1</h1>
<div>
    <h2 style="color:green">Partie 1</h2>
</div>
<div>
    <h5>1. Créer l'interface IDao avec une méthode getData:</h5>
    <img src="src/main/captures/IDao.png">
    <h5>2. Créer une implémentation de cette interface:</h5>
    <p>Version de Base de donnees(DaoImpl.java)</p>
    <img src="src/main/captures/DaoImpl.png">
    <p>Version de Web Services(DaoImplV2.java)</p>
    <img src="src/main/captures/DaoImplV2.png">
    <h5>3. Créer l'interface IMetier avec une méthode calcul:</h5>
    <img src="src/main/captures/IMetier.png">
    <h5>4. Créer une implémentation de cette interface en utilisant le couplage faible:</h5>
    <img src="src/main/captures/ImetierImpl.png">
    <h5>5. Faire l'injection des dépendances :</h5>
    <section>
        <h6>a. Par instanciation statique:</h6>
            <p>->Version de Base de Donnees</p>
                <img src="src/main/captures/Pres_Bdd.png">
            <p>->Version de Web Services</p>
                <img src="src/main/captures/Pres_ws.png">
    </section>
    <section>
        <h6>b. Par instanciation dynamique:</h6>
            <p style="color:green">Le fichier "config.txt":</p>
                <img src="src/main/captures/Config_File_screenshot.png">
            <p>->Version de Base de Donnees</p>
                <img src="src/main/captures/Pres_Bdd_dynamique.png">
            <p>->Version de Web Services</p>
                <img src="src/main/captures/Pres_ws_dynamique.png">
    </section>
    <h5>6. Faire l'injection des dépendances :</h5>
    <section>
        <h6>a. Par fichier "config.xml":</h6>
            <p style="color:green">Le fichier "config.xml" :</p>
                <img src="src/main/captures/config_xml.png">
            <p>->Version de Base de Donnees</p>
                <img src="src/main/captures/PresXml_Bdd.png">
            <p>->Version de Web Services</p>
                <img src="src/main/captures/PresXml_ws.png">
    </section>
    <section>
        <h6>b. Par annotation au lieu de .xml:</h6>
            <p>->Version de Base de Donnees</p>
                <img src="src/main/captures/PresAnn_Bdd.png">
            <p>->Version de Web Services</p>
                <img src="src/main/captures/PresAnn_ws.png">
    </section>
</div>