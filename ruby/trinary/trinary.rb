# Trinary
class Trinary
  attr_reader :trinary
  def initialize(trinary)
    @trinary = trinary
  end

  def to_decimal
    return 0 unless valid?
    trinary.chars.reverse.map.each_with_index do |multiplier, power|
      (3**power) * multiplier.to_i
    end.reduce(:+)
  end

  private

  def valid?
    !trinary.match(/[^0123]/)
  end
end
