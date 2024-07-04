-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 04-07-2024 a las 06:45:06
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdcarojaracl3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productocl3`
--

CREATE TABLE IF NOT EXISTS `tbl_productocl3` (
  `idproductocl3` int(11) NOT NULL AUTO_INCREMENT,
  `nombrecl3` varchar(255) NOT NULL,
  `precioventacl3` double NOT NULL,
  `stock` int(11) NOT NULL,
  `preciocompcl3` double NOT NULL,
  `estadocl3` varchar(255) NOT NULL,
  `descripcl3` varchar(255) NOT NULL,
  PRIMARY KEY (`idproductocl3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
