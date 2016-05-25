package br.facol.bsi.mtg.load.pojos;

import java.util.Date;

public class MtGSet {
	// Already marshalled attributes
	private String name;
	private String code;
	private Date releaseDate;
	private String mkm_name; //
	private String block; // [ 'undefined', 'Ice Age', 'Mirage', 'Tempest',
							// 'Urza\'s',
							// 'Masques', 'Invasion', 'Odyssey', 'Onslaught',
							// 'Mirrodin', 'Kamigawa', 'Ravnica', 'Time Spiral',
							// 'Lorwyn', 'Shadowmoor', 'Alara', 'Zendikar',
							// 'Scars of Mirrodin', 'Innistrad', 'Return to
							// Ravnica', 'Theros', 'Khans of Tarkir', 'Battle
							// for
							// Zendikar', 'Shadows over Innistrad' ]

	// Properties to be marshalled
	private String type; // [ 'core', 'expansion', 'reprint', 'promo', 'box',
							// 'starter', 'vanguard', 'un', 'masters', 'duel
							// deck', 'from the vault', 'planechase', 'premium
							// deck', 'archenemy', 'commander', 'conspiracy',
							// undefined ]

	private String border; // ['black', 'white', 'silver' ]

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMkm_name() {
		return mkm_name;
	}

	public void setMkm_name(String mkm_name) {
		this.mkm_name = mkm_name;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
