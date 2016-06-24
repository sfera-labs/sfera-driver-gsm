/*-
 * +======================================================================+
 * GSM
 * ---
 * Copyright (C) 2016 Sfera Labs S.r.l.
 * ---
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * -======================================================================-
 */

package cc.sferalabs.sfera.drivers.gsm;

abstract class Symbols {
	static final char[] STD_ALPHABET = { '\u0040', // COMMERCIAL AT
			'\u00A3', // POUND SIGN
			'\u0024', // DOLLAR SIGN
			'\u00A5', // YEN SIGN
			'\u00E8', // LATIN SMALL LETTER E WITH GRAVE
			'\u00E9', // LATIN SMALL LETTER E WITH ACUTE
			'\u00F9', // LATIN SMALL LETTER U WITH GRAVE
			'\u00EC', // LATIN SMALL LETTER I WITH GRAVE
			'\u00F2', // LATIN SMALL LETTER O WITH GRAVE
			'\u00C7', // LATIN CAPITAL LETTER C WITH CEDILLA
			'\n', // LINE FEED
			'\u00D8', // LATIN CAPITAL LETTER O WITH STROKE
			'\u00F8', // LATIN SMALL LETTER O WITH STROKE
			'\r', // CARRIAGE RETURN
			'\u00C5', // LATIN CAPITAL LETTER A WITH RING ABOVE
			'\u00E5', // LATIN SMALL LETTER A WITH RING ABOVE
			'\u0394', // GREEK CAPITAL LETTER DELTA
			'\u005F', // LOW LINE
			'\u03A6', // GREEK CAPITAL LETTER PHI
			'\u0393', // GREEK CAPITAL LETTER GAMMA
			'\u039B', // GREEK CAPITAL LETTER LAMDA
			'\u03A9', // GREEK CAPITAL LETTER OMEGA
			'\u03A0', // GREEK CAPITAL LETTER PI
			'\u03A8', // GREEK CAPITAL LETTER PSI
			'\u03A3', // GREEK CAPITAL LETTER SIGMA
			'\u0398', // GREEK CAPITAL LETTER THETA
			'\u039E', // GREEK CAPITAL LETTER XI
			'\u00A0', // ESCAPE TO EXTENSION TABLE (or displayed as NBSP, see
						// note above)
			'\u00C6', // LATIN CAPITAL LETTER AE
			'\u00E6', // LATIN SMALL LETTER AE
			'\u00DF', // LATIN SMALL LETTER SHARP S (German)
			'\u00C9', // LATIN CAPITAL LETTER E WITH ACUTE
			'\u0020', // SPACE
			'\u0021', // EXCLAMATION MARK
			'\u0022', // QUOTATION MARK
			'\u0023', // NUMBER SIGN
			'\u00A4', // CURRENCY SIGN
			'\u0025', // PERCENT SIGN
			'\u0026', // AMPERSAND
			'\'', // APOSTROPHE
			'\u0028', // LEFT PARENTHESIS
			'\u0029', // RIGHT PARENTHESIS
			'\u002A', // ASTERISK
			'\u002B', // PLUS SIGN
			'\u002C', // COMMA
			'\u002D', // HYPHEN-MINUS
			'\u002E', // FULL STOP
			'\u002F', // SOLIDUS
			'\u0030', // DIGIT ZERO
			'\u0031', // DIGIT ONE
			'\u0032', // DIGIT TWO
			'\u0033', // DIGIT THREE
			'\u0034', // DIGIT FOUR
			'\u0035', // DIGIT FIVE
			'\u0036', // DIGIT SIX
			'\u0037', // DIGIT SEVEN
			'\u0038', // DIGIT EIGHT
			'\u0039', // DIGIT NINE
			'\u003A', // COLON
			'\u003B', // SEMICOLON
			'\u003C', // LESS-THAN SIGN
			'\u003D', // EQUALS SIGN
			'\u003E', // GREATER-THAN SIGN
			'\u003F', // QUESTION MARK
			'\u00A1', // INVERTED EXCLAMATION MARK
			'\u0041', // LATIN CAPITAL LETTER A
			'\u0042', // LATIN CAPITAL LETTER B
			'\u0043', // LATIN CAPITAL LETTER C
			'\u0044', // LATIN CAPITAL LETTER D
			'\u0045', // LATIN CAPITAL LETTER E
			'\u0046', // LATIN CAPITAL LETTER F
			'\u0047', // LATIN CAPITAL LETTER G
			'\u0048', // LATIN CAPITAL LETTER H
			'\u0049', // LATIN CAPITAL LETTER I
			'\u004A', // LATIN CAPITAL LETTER J
			'\u004B', // LATIN CAPITAL LETTER K
			'\u004C', // LATIN CAPITAL LETTER L
			'\u004D', // LATIN CAPITAL LETTER M
			'\u004E', // LATIN CAPITAL LETTER N
			'\u004F', // LATIN CAPITAL LETTER O
			'\u0050', // LATIN CAPITAL LETTER P
			'\u0051', // LATIN CAPITAL LETTER Q
			'\u0052', // LATIN CAPITAL LETTER R
			'\u0053', // LATIN CAPITAL LETTER S
			'\u0054', // LATIN CAPITAL LETTER T
			'\u0055', // LATIN CAPITAL LETTER U
			'\u0056', // LATIN CAPITAL LETTER V
			'\u0057', // LATIN CAPITAL LETTER W
			'\u0058', // LATIN CAPITAL LETTER X
			'\u0059', // LATIN CAPITAL LETTER Y
			'\u005A', // LATIN CAPITAL LETTER Z
			'\u00C4', // LATIN CAPITAL LETTER A WITH DIAERESIS
			'\u00D6', // LATIN CAPITAL LETTER O WITH DIAERESIS
			'\u00D1', // LATIN CAPITAL LETTER N WITH TILDE
			'\u00DC', // LATIN CAPITAL LETTER U WITH DIAERESIS
			'\u00A7', // SECTION SIGN
			'\u00BF', // INVERTED QUESTION MARK
			'\u0061', // LATIN SMALL LETTER A
			'\u0062', // LATIN SMALL LETTER B
			'\u0063', // LATIN SMALL LETTER C
			'\u0064', // LATIN SMALL LETTER D
			'\u0065', // LATIN SMALL LETTER E
			'\u0066', // LATIN SMALL LETTER F
			'\u0067', // LATIN SMALL LETTER G
			'\u0068', // LATIN SMALL LETTER H
			'\u0069', // LATIN SMALL LETTER I
			'\u006A', // LATIN SMALL LETTER J
			'\u006B', // LATIN SMALL LETTER K
			'\u006C', // LATIN SMALL LETTER L
			'\u006D', // LATIN SMALL LETTER M
			'\u006E', // LATIN SMALL LETTER N
			'\u006F', // LATIN SMALL LETTER O
			'\u0070', // LATIN SMALL LETTER P
			'\u0071', // LATIN SMALL LETTER Q
			'\u0072', // LATIN SMALL LETTER R
			'\u0073', // LATIN SMALL LETTER S
			'\u0074', // LATIN SMALL LETTER T
			'\u0075', // LATIN SMALL LETTER U
			'\u0076', // LATIN SMALL LETTER V
			'\u0077', // LATIN SMALL LETTER W
			'\u0078', // LATIN SMALL LETTER X
			'\u0079', // LATIN SMALL LETTER Y
			'\u007A', // LATIN SMALL LETTER Z
			'\u00E4', // LATIN SMALL LETTER A WITH DIAERESIS
			'\u00F6', // LATIN SMALL LETTER O WITH DIAERESIS
			'\u00F1', // LATIN SMALL LETTER N WITH TILDE
			'\u00FC', // LATIN SMALL LETTER U WITH DIAERESIS
			'\u00E0', // LATIN SMALL LETTER A WITH GRAVE
	};

	static final char[] EXT_ALPHABET = { '\u000c', // FORM FEED
			'\u005e', // CIRCUMFLEX ACCENT
			'\u007b', // LEFT CURLY BRACKET
			'\u007d', // RIGHT CURLY BRACKET
			'\\', // REVERSE SOLIDUS
			'\u005b', // LEFT SQUARE BRACKET
			'\u007e', // TILDE
			'\u005d', // RIGHT SQUARE BRACKET
			'\u007c', // VERTICAL LINES
			'\u20ac', // EURO SIGN
	};

	static final char[] EXT_BYTES = { 0x1b0a, // FORM FEED
			0x1b14, // CIRCUMFLEX ACCENT
			0x1b28, // LEFT CURLY BRACKET
			0x1b29, // RIGHT CURLY BRACKET
			0x1b2f, // REVERSE SOLIDUS
			0x1b3c, // LEFT SQUARE BRACKET
			0x1b3d, // TILDE
			0x1b3e, // RIGHT SQUARE BRACKET
			0x1b40, // VERTICAL LINES
			0x1b65, // EURO SIGN
	};

	static final char[][] GRC_ALPHABET_REMAPPING = { { '\u0386', '\u0041' }, // GREEK
																				// CAPITAL
																				// LETTER
																				// ALPHA
																				// WITH
																				// TONOS
			{ '\u0388', '\u0045' }, // GREEK CAPITAL LETTER EPSILON WITH TONOS
			{ '\u0389', '\u0048' }, // GREEK CAPITAL LETTER ETA WITH TONOS
			{ '\u038A', '\u0049' }, // GREEK CAPITAL LETTER IOTA WITH TONOS
			{ '\u038C', '\u004F' }, // GREEK CAPITAL LETTER OMICRON WITH TONOS
			{ '\u038E', '\u0059' }, // GREEK CAPITAL LETTER UPSILON WITH TONOS
			{ '\u038F', '\u03A9' }, // GREEK CAPITAL LETTER OMEGA WITH TONOS
			{ '\u0390', '\u0049' }, // GREEK SMALL LETTER IOTA WITH DIALYTIKA
									// AND TONOS
			{ '\u0391', '\u0041' }, // GREEK CAPITAL LETTER ALPHA
			{ '\u0392', '\u0042' }, // GREEK CAPITAL LETTER BETA
			{ '\u0393', '\u0393' }, // GREEK CAPITAL LETTER GAMMA
			{ '\u0394', '\u0394' }, // GREEK CAPITAL LETTER DELTA
			{ '\u0395', '\u0045' }, // GREEK CAPITAL LETTER EPSILON
			{ '\u0396', '\u005A' }, // GREEK CAPITAL LETTER ZETA
			{ '\u0397', '\u0048' }, // GREEK CAPITAL LETTER ETA
			{ '\u0398', '\u0398' }, // GREEK CAPITAL LETTER THETA
			{ '\u0399', '\u0049' }, // GREEK CAPITAL LETTER IOTA
			{ '\u039A', '\u004B' }, // GREEK CAPITAL LETTER KAPPA
			{ '\u039B', '\u039B' }, // GREEK CAPITAL LETTER LAMDA
			{ '\u039C', '\u004D' }, // GREEK CAPITAL LETTER MU
			{ '\u039D', '\u004E' }, // GREEK CAPITAL LETTER NU
			{ '\u039E', '\u039E' }, // GREEK CAPITAL LETTER XI
			{ '\u039F', '\u004F' }, // GREEK CAPITAL LETTER OMICRON
			{ '\u03A0', '\u03A0' }, // GREEK CAPITAL LETTER PI
			{ '\u03A1', '\u0050' }, // GREEK CAPITAL LETTER RHO
			{ '\u03A3', '\u03A3' }, // GREEK CAPITAL LETTER SIGMA
			{ '\u03A4', '\u0054' }, // GREEK CAPITAL LETTER TAU
			{ '\u03A5', '\u0059' }, // GREEK CAPITAL LETTER UPSILON
			{ '\u03A6', '\u03A6' }, // GREEK CAPITAL LETTER PHI
			{ '\u03A7', '\u0058' }, // GREEK CAPITAL LETTER CHI
			{ '\u03A8', '\u03A8' }, // GREEK CAPITAL LETTER PSI
			{ '\u03A9', '\u03A9' }, // GREEK CAPITAL LETTER OMEGA
			{ '\u03AA', '\u0049' }, // GREEK CAPITAL LETTER IOTA WITH DIALYTIKA
			{ '\u03AB', '\u0059' }, // GREEK CAPITAL LETTER UPSILON WITH
									// DIALYTIKA
			{ '\u03AC', '\u0041' }, // GREEK SMALL LETTER ALPHA WITH TONOS
			{ '\u03AD', '\u0045' }, // GREEK SMALL LETTER EPSILON WITH TONOS
			{ '\u03AE', '\u0048' }, // GREEK SMALL LETTER ETA WITH TONOS
			{ '\u03AF', '\u0049' }, // GREEK SMALL LETTER IOTA WITH TONOS
			{ '\u03B0', '\u0059' }, // GREEK SMALL LETTER UPSILON WITH DIALYTIKA
									// AND TONOS
			{ '\u03B1', '\u0041' }, // GREEK SMALL LETTER ALPHA
			{ '\u03B2', '\u0042' }, // GREEK SMALL LETTER BETA
			{ '\u03B3', '\u0393' }, // GREEK SMALL LETTER GAMMA
			{ '\u03B4', '\u0394' }, // GREEK SMALL LETTER DELTA
			{ '\u03B5', '\u0045' }, // GREEK SMALL LETTER EPSILON
			{ '\u03B6', '\u005A' }, // GREEK SMALL LETTER ZETA
			{ '\u03B7', '\u0048' }, // GREEK SMALL LETTER ETA
			{ '\u03B8', '\u0398' }, // GREEK SMALL LETTER THETA
			{ '\u03B9', '\u0049' }, // GREEK SMALL LETTER IOTA
			{ '\u03BA', '\u004B' }, // GREEK SMALL LETTER KAPPA
			{ '\u03BB', '\u039B' }, // GREEK SMALL LETTER LAMDA
			{ '\u03BC', '\u004D' }, // GREEK SMALL LETTER MU
			{ '\u03BD', '\u004E' }, // GREEK SMALL LETTER NU
			{ '\u03BE', '\u039E' }, // GREEK SMALL LETTER XI
			{ '\u03BF', '\u004F' }, // GREEK SMALL LETTER OMICRON
			{ '\u03C0', '\u03A0' }, // GREEK SMALL LETTER PI
			{ '\u03C1', '\u0050' }, // GREEK SMALL LETTER RHO
			{ '\u03C2', '\u03A3' }, // GREEK SMALL LETTER FINAL SIGMA
			{ '\u03C3', '\u03A3' }, // GREEK SMALL LETTER SIGMA
			{ '\u03C4', '\u0054' }, // GREEK SMALL LETTER TAU
			{ '\u03C5', '\u0059' }, // GREEK SMALL LETTER UPSILON
			{ '\u03C6', '\u03A6' }, // GREEK SMALL LETTER PHI
			{ '\u03C7', '\u0058' }, // GREEK SMALL LETTER CHI
			{ '\u03C8', '\u03A8' }, // GREEK SMALL LETTER PSI
			{ '\u03C9', '\u03A9' }, // GREEK SMALL LETTER OMEGA
			{ '\u03CA', '\u0049' }, // GREEK SMALL LETTER IOTA WITH DIALYTIKA
			{ '\u03CB', '\u0059' }, // GREEK SMALL LETTER UPSILON WITH DIALYTIKA
			{ '\u03CC', '\u004F' }, // GREEK SMALL LETTER OMICRON WITH TONOS
			{ '\u03CD', '\u0059' }, // GREEK SMALL LETTER UPSILON WITH TONOS
			{ '\u03CE', '\u03A9' } // GREEK SMALL LETTER OMEGA WITH TONOS
	};
}
