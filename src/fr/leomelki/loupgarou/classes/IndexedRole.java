package fr.leomelki.loupgarou.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import fr.leomelki.loupgarou.roles.Role;

@RequiredArgsConstructor
public class IndexedRole {
	@Getter private final Role role;
	@Getter private int number = 1;

	public void increase() {
		number++;
	}
}
