-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 20, 2024 at 11:46 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugas_visual`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id_brand` int(11) NOT NULL,
  `brand_name` varchar(100) NOT NULL,
  `brand_location` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id_brand`, `brand_name`, `brand_location`) VALUES
(2, 'Consina Bandung', 'Jl. Dr. Ir. H. Soekarno No.297 – 299, Kedung Baruk, Kec. Rungkut, Surabaya, Jawa Timur 60298. '),
(7, 'CoolWalk Rusia', 'JL. RAYA KOPO SOREANG KM 11,5/ No. 127A, BANDUNG, Kabupaten Bandung, Jawa Barat.'),
(8, 'Arei Semarang', 'Jl. Radio Dalam Raya No.21. Kebayoran Baru, Jakarta Selatan Telp. 021 7262818'),
(9, 'Local Brand', 'Jalan jauh'),
(10, 'Xian Wei', 'china'),
(12, 'tes brand Original', 'jl. tb simatupang no 1'),
(13, 'Brand KW Super', 'Jl. raya narogong '),
(14, 'Eiger Sumatra', 'jl. sumatra no12');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id_category` int(50) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id_category`, `name`) VALUES
(1, 'Tenda Camping Anak'),
(2, 'Tas Daypack Sekolah'),
(3, 'Tas Carrier'),
(4, 'Sepatu Trail Running'),
(10, 'Tenda Event'),
(15, 'Rompi');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id_customer` int(10) NOT NULL,
  `nama_depan` varchar(50) NOT NULL,
  `nama_belakang` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `telepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id_customer`, `nama_depan`, `nama_belakang`, `alamat`, `kota`, `telepon`) VALUES
(2, 'Pelanggan', 'setia', 'Jl. Raya Terusan Kopo KM.11,5, No.127A Bandung - Indonesia.', 'bandun', '0812342234213'),
(4, 'is mael', 'bin mael', ' Jl. Panca Warga Satu No.3, RT.6/RW.1, Daerah Khusus Ibukota Jakarta 13410', 'serwawak', '082212441234'),
(7, 'pelanggan baru ', 'baru banget', 'tes alamat', 'depok', '081233123422'),
(9, 'boboiboy', 'bin amato', 'jl. kampong durian runtuh', 'serawak', '62897656786');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id_employee` int(11) NOT NULL,
  `id_login` varchar(100) NOT NULL,
  `password_login` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id_employee`, `id_login`, `password_login`, `nama`, `alamat`) VALUES
(1, 'karyawansatu1', 'passwordkaryawan1', 'Budiono Siregar ', 'Sigedong\r\nKec. Tretep\r\nKabupaten Temanggung\r\nJawa Tengah'),
(3, 'admin', 'admin', 'admin', 'admin'),
(6, 'tes2', 'tes2pw', 'baba', 'jauh'),
(7, 'joko', 'joko1', 'joko mas law', 'surakarta ');

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

CREATE TABLE `equipment` (
  `id_equipment` int(11) NOT NULL,
  `equipment_name` varchar(100) NOT NULL,
  `id_category` int(50) NOT NULL,
  `id_brand` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `id_size` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`id_equipment`, `equipment_name`, `id_category`, `id_brand`, `price`, `id_size`) VALUES
(11, 'Tenda Hajatan', 10, '1', 120000, '26'),
(12, 'Tenda Militer', 10, '7', 120000, '24'),
(14, 'Tenda Pramuka', 1, '1', 11111, '1'),
(15, 'Tenda Car Free Day', 10, '1', 150000, '26'),
(16, 'Hooka Extreme', 4, '1', 12000, '16'),
(17, 'Tenda baru ', 10, '9', 121332, '26'),
(18, 'Adidas KW super', 4, '2', 12000, '32'),
(19, 'Trikora Premium ', 2, '8', 100000, '5'),
(20, 'Duralumin ', 9, '2', 13000, '34'),
(21, 'Tas Babon T300', 2, '13', 23000, '5'),
(22, 'Tenda Hajatan ', 10, '13', 300000, '35'),
(23, 'rompi anti peluru', 15, '2', 500000, '36'),
(24, 'rompi perang gaza', 15, '10', 575000, '36');

-- --------------------------------------------------------

--
-- Table structure for table `item_rentals`
--

CREATE TABLE `item_rentals` (
  `id_equipment` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `id_rental` int(11) DEFAULT NULL,
  `id_item_rental` int(11) NOT NULL,
  `id_size` int(11) DEFAULT NULL,
  `price` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `item_rentals`
--

INSERT INTO `item_rentals` (`id_equipment`, `quantity`, `id_rental`, `id_item_rental`, `id_size`, `price`) VALUES
(13, 3, 34, 1, 24, '200000'),
(16, 1, 34, 2, 17, '2104500'),
(13, 7, 9, 3, 24, ''),
(11, 4, 25, 14, 24, ''),
(11, 2, 32, 15, 24, '240000'),
(14, 1, 33, 16, 4, '11111'),
(16, 3, 33, 17, 20, '36000'),
(16, 1, 33, 18, 16, '12000'),
(16, 2, 35, 19, 32, '24000'),
(23, 2, 37, 20, 36, '1000000'),
(18, 1, 37, 21, 23, '12000'),
(19, 3, 37, 22, 9, '300000');

-- --------------------------------------------------------

--
-- Table structure for table `rentals`
--

CREATE TABLE `rentals` (
  `id_rental` int(10) NOT NULL,
  `id_customer` varchar(110) NOT NULL,
  `created_at` varchar(111) NOT NULL,
  `rental_days` varchar(111) NOT NULL,
  `total_price` varchar(111) DEFAULT NULL,
  `status` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rentals`
--

INSERT INTO `rentals` (`id_rental`, `id_customer`, `created_at`, `rental_days`, `total_price`, `status`) VALUES
(32, '2', '12/12/23', '2', '480000', 'Booking'),
(33, '4', '11/12/23', '3', '177333', 'Ongoing'),
(34, '4', '11/12/23', '3', '177333', 'Done'),
(37, '9', '20/05/2024', '3', '3936000', 'Done');

-- --------------------------------------------------------

--
-- Table structure for table `size`
--

CREATE TABLE `size` (
  `id_size` int(11) NOT NULL,
  `id_category` int(11) NOT NULL,
  `size_label` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `size`
--

INSERT INTO `size` (`id_size`, `id_category`, `size_label`) VALUES
(1, 1, '4-5 orang'),
(2, 1, '2-3 orang'),
(3, 1, '5-6 orang'),
(4, 1, '10 orang lebih'),
(5, 2, '10 Liter'),
(6, 2, '15 Liter'),
(7, 2, '20 Liter'),
(8, 2, '25 Liter'),
(9, 2, '30 Liter'),
(10, 3, '40 Liter'),
(11, 3, '40 - 45 Liter'),
(12, 3, '45 - 50 Liter'),
(13, 3, '50 - 60 Liter'),
(14, 3, '60 - 70 Liter'),
(16, 4, '38'),
(17, 4, '39'),
(18, 4, '40'),
(19, 4, '41'),
(20, 4, '42'),
(21, 4, '43'),
(22, 4, '44'),
(23, 4, '45'),
(24, 10, '20 orang'),
(25, 10, '30 orang - 50 orang'),
(27, 4, '38'),
(28, 1, '15 Orang'),
(32, 4, '31'),
(33, 9, '0.5 meter'),
(34, 9, '1 meter '),
(35, 10, '100 orang'),
(36, 15, 'kecil'),
(37, 15, 'besar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id_brand`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id_category`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id_employee`);

--
-- Indexes for table `equipment`
--
ALTER TABLE `equipment`
  ADD PRIMARY KEY (`id_equipment`);

--
-- Indexes for table `item_rentals`
--
ALTER TABLE `item_rentals`
  ADD PRIMARY KEY (`id_item_rental`);

--
-- Indexes for table `rentals`
--
ALTER TABLE `rentals`
  ADD PRIMARY KEY (`id_rental`),
  ADD UNIQUE KEY `rental_id` (`id_rental`);

--
-- Indexes for table `size`
--
ALTER TABLE `size`
  ADD PRIMARY KEY (`id_size`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id_brand` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id_category` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id_customer` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id_employee` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `id_equipment` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `item_rentals`
--
ALTER TABLE `item_rentals`
  MODIFY `id_item_rental` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `rentals`
--
ALTER TABLE `rentals`
  MODIFY `id_rental` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `size`
--
ALTER TABLE `size`
  MODIFY `id_size` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
