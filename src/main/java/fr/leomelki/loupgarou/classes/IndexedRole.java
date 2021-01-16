package main.java.fr.leomelki.loupgarou.classes;

import main.java.fr.leomelki.loupgarou.roles.Role;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IndexedRole {
	@Getter private final Role role;
	@Getter private int number = 1;

	public IndexedRole(Role role) {
		this.role = role;
	}

	public void increase() {
		number++;
	}
}
