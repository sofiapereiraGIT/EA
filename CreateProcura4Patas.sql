-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema procura4patas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema procura4patas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `procura4patas` DEFAULT CHARACTER SET utf8mb4 ;
USE `procura4patas` ;

-- -----------------------------------------------------
-- Table `procura4patas`.`Animal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procura4patas`.`Animal` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `UtilizadorEmail` VARCHAR(255) NOT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `Fotografia` VARCHAR(255) NULL DEFAULT NULL,
  `Sexo` CHAR(1) NOT NULL,
  `Idade` CHAR(1) NOT NULL,
  `Raça` VARCHAR(255) NULL DEFAULT NULL,
  `Porte` CHAR(1) NOT NULL,
  `CorPelo` VARCHAR(255) NULL DEFAULT NULL,
  `CompPelo` CHAR(1) NOT NULL,
  `Estado` CHAR(1) NOT NULL,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Concelho` VARCHAR(255) NULL DEFAULT NULL,
  `Discriminator` CHAR(1) NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FKAnimal549890` (`UtilizadorEmail` ASC),
  CONSTRAINT `FKAnimal549890`
    FOREIGN KEY (`UtilizadorEmail`)
    REFERENCES `procura4patas`.`utilizador` (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `procura4patas`.`Canil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procura4patas`.`Canil` (
  `Morada` VARCHAR(255) NULL DEFAULT NULL,
  `Horario` VARCHAR(255) NULL DEFAULT NULL,
  `SiteOficial` VARCHAR(255) NULL DEFAULT NULL,
  `Facebook` VARCHAR(255) NULL DEFAULT NULL,
  `Instagram` VARCHAR(255) NULL DEFAULT NULL,
  `UtilizadorEmail` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`UtilizadorEmail`),
  CONSTRAINT `FKCanil576462`
    FOREIGN KEY (`UtilizadorEmail`)
    REFERENCES `procura4patas`.`utilizador` (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `procura4patas`.`Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procura4patas`.`Pedido` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `UtilizadorEmail` VARCHAR(255) NOT NULL,
  `UtilizadorComumUtilizadorEmail` VARCHAR(255) NOT NULL,
  `AnimalID` INT(10) NOT NULL,
  `Data` DATE NULL DEFAULT NULL,
  `Estado` CHAR(1) NOT NULL,
  `DataUltimoContacto` DATE NULL DEFAULT NULL,
  `Discriminator` CHAR(1) NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FKPedido124302` (`AnimalID` ASC),
  INDEX `FKPedido970999` (`UtilizadorComumUtilizadorEmail` ASC),
  INDEX `FKPedido576596` (`UtilizadorEmail` ASC),
  CONSTRAINT `FKPedido124302`
    FOREIGN KEY (`AnimalID`)
    REFERENCES `procura4patas`.`animal` (`ID`),
  CONSTRAINT `FKPedido576596`
    FOREIGN KEY (`UtilizadorEmail`)
    REFERENCES `procura4patas`.`utilizador` (`Email`),
  CONSTRAINT `FKPedido970999`
    FOREIGN KEY (`UtilizadorComumUtilizadorEmail`)
    REFERENCES `procura4patas`.`utilizadorcomum` (`UtilizadorEmail`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `procura4patas`.`Utilizador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procura4patas`.`Utilizador` (
  `Email` VARCHAR(255) NOT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `Fotografia` VARCHAR(255) NULL DEFAULT NULL,
  `Concelho` VARCHAR(255) NULL DEFAULT NULL,
  `Telemovel` VARCHAR(255) NULL DEFAULT NULL,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `procura4patas`.`UtilizadorComum`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procura4patas`.`UtilizadorComum` (
  `UtilizadorEmail` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`UtilizadorEmail`),
  CONSTRAINT `FKUtilizador299204`
    FOREIGN KEY (`UtilizadorEmail`)
    REFERENCES `procura4patas`.`utilizador` (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
