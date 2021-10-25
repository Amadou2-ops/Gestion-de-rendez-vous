-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 25 oct. 2021 à 18:21
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gs_rv`
--

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

DROP TABLE IF EXISTS `consultation`;
CREATE TABLE IF NOT EXISTS `consultation` (
  `codeC` int(11) NOT NULL AUTO_INCREMENT,
  `prestation` varchar(200) NOT NULL,
  `date` datetime NOT NULL,
  `ordonance` varchar(200) NOT NULL,
  PRIMARY KEY (`codeC`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ordonance`
--

DROP TABLE IF EXISTS `ordonance`;
CREATE TABLE IF NOT EXISTS `ordonance` (
  `codeO` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(200) NOT NULL,
  `posologie` varchar(200) NOT NULL,
  PRIMARY KEY (`codeO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `usere`
--

DROP TABLE IF EXISTS `usere`;
CREATE TABLE IF NOT EXISTS `usere` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(25) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `role` varchar(25) DEFAULT NULL,
  `antecedant` varchar(25) DEFAULT NULL,
  `codeC` int(11) DEFAULT NULL,
  `codeO` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `codeC` (`codeC`),
  KEY `codeO` (`codeO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
