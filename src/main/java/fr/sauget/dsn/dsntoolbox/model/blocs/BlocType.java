/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.dsn.dsntoolbox.model.blocs;

/**
 *
 * @author marc
 */
public enum BlocType {
    
    ENVOI("S10.G00.00"),
    EMETTEUR("S10.G00.01"),
    CONTACT_EMETTEUR("S10.G00.02"),
    DESTINATAIRE_CRE("S10.G00.03"),
    DSN_MENSUELLE("S20.G00.05"),
    CONTACT_CHEZ_LE_DECLARE("S20.G00.07"),
    IDENTIFIANT_DE_ORGANISME_DESTINATAIRE_DE_LA_DECLARATION("S20.G00.08"),
    ENTREPRISE("S21.G00.06"),
    ETABLISSEMENT("S21.G00.11"),
    ADHESION_PREVOYANCE("S21.G00.15"),
    CHANGEMENTS_DESTINATAIRE_ADHESION_PREVOYANCE("S21.G00.16"),
    COTISATION_ETABLISSEMENT("S21.G00.82"),
    VERSEMENT_ORGANISME_DE_PROTECTION_SOCIALE("S21.G00.20"),
    COMPOSANT_DE_VERSEMENT("S21.G00.55"),
    BORDEREAU_DE_COTISATION_DUE("S21.G00.22"),
    COTISATION_AGREGEE("S21.G00.23"),
    AFFECTATION_FISCALE("S21.G00.42"),
    ASSUJETTISSEMENT_FISCAL("S21.G00.44"),
    INDIVIDU("S21.G00.30"),
    CHANGEMENTS_INDIVIDU("S21.G00.31"),
    PENIBILITE("S21.G00.34"),
    CONTRAT("S21.G00.40"),
    CHANGEMENTS_CONTRAT("S21.G00.41"),
    ARRET_DE_TRAVAIL("S21.G00.60"),
    TEMPS_PARTIEL_THERAPEUTIQUE("S21.G00.66"),
    FIN_DU_CONTRAT("S21.G00.62"),
    PREAVIS_DE_FIN_DE_CONTRAT("S21.G00.63"),
    AUTRE_SUSPENSION_DE_EXECUTION_DU_CONTRAT("S21.G00.65"),
    AFFILIATION_PREVOYANCE("S21.G00.70"),
    AYANT_DROIT("S21.G00.73"),
    RETRAITE_COMPLEMENTAIRE("S21.G00.71"),
    VERSEMENT_INDIVIDU("S21.G00.50"),
    REMUNERATION("S21.G00.51"),
    ACTIVITE("S21.G00.53"),
    PRIME_GRATIFICATION_ET_INDEMNITE("S21.G00.52"),
    AUTRE_ELEMENT_DE_REVENU_BRUT("S21.G00.54"),
    BASE_ASSUJETTIE("S21.G00.78"),
    COMPOSANT_DE_BASE_ASSUJETTIE("S21.G00.79"),
    COTISATION_INDIVIDUELLE("S21.G00.81"),
    ANCIENNETE("S21.G00.86"),
    LIEU_DE_TRAVAIL("S21.G00.85"),
    BENEFICIAIRE_DES_HONORAIRES("S89.G00.32"),
    AVANTAGES_EN_NATURE("S89.G00.33"),
    PRISE_EN_CHARGE_DES_INDEMNITES("S89.G00.35"),
    REMUNERATIONS("S89.G00.43"),
    ACTIONS_GRATUITES("S89.G00.87"),
    OPTIONS_SUR_TITRES("S89.G00.88"),
    BONS_DE_SOUSCRIPTION_DE_PARTS_DE_CREATEUR_ENTREPRISE("S89.G00.89"),
    INDIVIDU_AGIRC_ARRCO("S89.G00.91"),
    BASES_SPECIFIQUES_AGIRC_ARRCO("S89.G00.92"),
    TOTAL_DE_ENVOI("S90.G00.90");

    BlocType(String val){value = val;};
    private final String value; 
    
    public String getValue(){return value;}

    
}