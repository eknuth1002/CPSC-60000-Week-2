package com.elliotknuth;

public class Enums {
	public static enum GlazeEnums {
		CLEAR {
			public String toString() {
				return "Clear";
			}
		}
	}

	public static enum PieceEnums {
		CUP {
			public String toString() {
				return "cup";
			}
		},
		MUG {
			public String toString() {
				return "mug";
			}
		},
		SMALL_PLATE {
			public String toString() {
				return "small plate";
			}
		},
		LARGE_PLATE {
			public String toString() {
				return "large plate";
			}
		},
		SMALL_BOWL {
			public String toString() {
				return "small bowl";
			}
		},
		LARGE_BOWL {
			public String toString() {
				return "large bowl";
			}
		},
		TEAPOT {
			public String toString() {
				return "teapot";
			}
		}
	}
	
	public static enum LocationEnums {
		ENGLAND {
			public String toString() {
				return "English";
			}
		},
		JAPAN {
			public String toString() {
				return "Japanese";
			}
		},
		USA {
			public String toString() {
				return "American";
			}
		}
	}
}